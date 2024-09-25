

<style>
    /* Loader styles */
    #loader-container {
        display: none;
        position: fixed;
        top: 0;
        left: 0;
        width: 100%;
        height: 100%;
        background: rgba(0, 0, 0, 0.6);
        justify-content: center;
        align-items: center;
        z-index: 1000;
    }

    .loader {
        border: 16px solid #e0e0e0;
        border-top: 16px solid #00bcd4;
        border-radius: 50%;
        width: 120px;
        height: 120px;
        animation: spin 2s linear infinite;
    }

    @keyframes spin {
        0% { transform: rotate(0deg); }
        100% { transform: rotate(360deg); }
    }
</style>
<script>


    function createLoader() {
        // Create loader container
        const loaderContainer = document.createElement('div');
        loaderContainer.id = 'loader-container';
        loaderContainer.style.display = 'none';
        loaderContainer.style.position = 'fixed';
        loaderContainer.style.top = '0';
        loaderContainer.style.left = '0';
        loaderContainer.style.width = '100%';
        loaderContainer.style.height = '100%';
        loaderContainer.style.background = 'rgba(0, 0, 0, 0.5)';
        loaderContainer.style.justifyContent = 'center';
        loaderContainer.style.alignItems = 'center';
        loaderContainer.style.zIndex = '1000';

        // Create loader
        const loader = document.createElement('div');
        loader.className = 'loader';
        loader.style.border = '16px solid #f3f3f3';
        loader.style.borderTop = '16px solid #3498db';
        loader.style.borderRadius = '50%';
        loader.style.width = '120px';
        loader.style.height = '120px';
        loader.style.animation = 'spin 2s linear infinite';

        // Append loader to loader container
        loaderContainer.appendChild(loader);

        // Append loader container to body
        document.body.appendChild(loaderContainer);
    }

    function startLoader(bodyId) {
        const body = document.getElementById(bodyId);
        if (body) {
            const loaderContainer = document.getElementById('loader-container');
            if (!loaderContainer) {
                createLoader();
            }
            document.getElementById('loader-container').style.display = 'flex';
        } else {
            console.error('Body element not found');
        }
    }

    function stopLoader() {
        const loaderContainer = document.getElementById('loader-container');
        if (loaderContainer) {
            loaderContainer.style.display = 'none';
        } else {
            console.error('Loader container not found');
        }
    }

</script>
